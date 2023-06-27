package app.cursos.techcenter.service;

import app.cursos.techcenter.model.Alumno;
import app.cursos.techcenter.model.Cursos;
import app.cursos.techcenter.model.Matricula;
import app.cursos.techcenter.model.Pago;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MatriculaService {

    private List<Matricula> matriculas = new ArrayList<>();

    public void matricularAlumno(Alumno alumno, Cursos curso, String tipoMatricula, double descuento, int numCuotas) {
        double precioCurso = curso.getPrecio();
        if (descuento > 0) {
            precioCurso -= descuento;
        }

        Matricula matricula = new Matricula(tipoMatricula, obtenerFechaActual(), precioCurso, numCuotas, 0, null, curso, alumno);
        matricula.setPagos(new ArrayList<>()); // Inicializar la lista de pagos
        matriculas.add(matricula);
        alumno.setCurso(curso);

        if (numCuotas == obtenerNumeroCuotas(tipoMatricula)) {
            // Pago en una sola cuota
            registrarPago(matricula, obtenerFechaActual(), precioCurso);
        } else {
            for (int cuota = obtenerNumeroCuotas(tipoMatricula); cuota <= numCuotas; cuota++) {
                System.out.println("Cuota: " + cuota);
            }
        }
    }

    public List<Matricula> consultarMatriculasPorCurso(Cursos curso) {
        List<Matricula> matriculasPorCurso = new ArrayList<>();
        for (Matricula matricula : matriculas) {
            if (matricula.getCurso().equals(curso)) {
                matriculasPorCurso.add(matricula);
            }
        }
        return matriculasPorCurso;
    }

    public void registrarPago(Matricula matricula, String fechaPago, double importePago) {
        Pago pago = new Pago(fechaPago, importePago);
        matricula.getPagos().add(pago);
        actualizarEstadoMatricula(matricula);
    }

    public double calcularDeuda(Matricula matricula) {
        double totalPagado = 0;
        for (Pago pago : matricula.getPagos()) {
            totalPagado += pago.getImportePago();
        }
        return matricula.getPrecio() - totalPagado;
    }

    private void actualizarEstadoMatricula(Matricula matricula) {
        double deuda = calcularDeuda(matricula);
        if (deuda == 0) {
            matricula.setEstado("Pagado");
        } else if (deuda == matricula.getPrecio()) {
            matricula.setEstado("Pendiente");
        } else {
            matricula.setEstado("Parcialmente Pagado");
        }
    }

    private int obtenerNumeroCuotas(String tipoMatricula) {
        switch (tipoMatricula) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            default:
                return 0;
        }
    }

    private String obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.toString();
    }
}
