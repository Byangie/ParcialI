import gt.edu.miumg.Pasteleria.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Empleado empleado = new Empleado("Angelica Mejía", "Gerente", 3500);
        System.out.println("empleado" + empleado);
        Empleado empleado2 = new Empleado("Juan Mejía", "Supervisor", 2000);
        System.out.println("empleado2" + empleado2);

        Equipo equipo = new Equipo("Estufa", "Apagado");
        System.out.println("equipo =" + equipo);
        Equipo equipo2 = new Equipo("Refri", "Encendido");
        System.out.println("equipo2 =" + equipo2);

        Ingrediente masa = new Masa("suave", 2);
        System.out.println("ingrediente1 = " + masa);
        Ingrediente relleno = new Relleno( "Nutella", 3);
        System.out.println("ingrediente2 = " + relleno);
        Ingrediente cobertura = new Cobertura( "Vainilla",3);
        System.out.println("ingrediente3 = " + cobertura);

        Postre dulce = new Crepa("Cafe colombiano", 10, 5);
        System.out.println("crepa = " + dulce);
        Postre salado = new Brownie("amargo","delibrownie","Pequeño", 20);
        System.out.println("brownie = " + salado);

        Sucursal sucursalGuatemala = new Sucursal("Sucursal Guatemala", "Zona 10");
        System.out.println("Sucursal Guatemala = " + sucursalGuatemala);
        sucursalGuatemala.agregarEmpleado(empleado);
        sucursalGuatemala.agregarEmpleado(empleado2);
        sucursalGuatemala.agregarEquipo(equipo);
        sucursalGuatemala.agregarEspecialidad(dulce);
        System.out.println("Sucursal Guatemala = " + sucursalGuatemala);

        Sucursal sucursaUSA = new Sucursal("Sucursal Estados Unidos", "Av. 3");
        System.out.println("Sucursal Estados Unidps = " + sucursaUSA);
        sucursaUSA.agregarEmpleado(empleado);
        sucursaUSA.agregarEmpleado(empleado2);
        sucursaUSA.agregarEquipo(equipo);
        sucursaUSA.agregarEspecialidad(salado);
        System.out.println("Sucursal Estados Unidos = " + sucursaUSA);

    }
}