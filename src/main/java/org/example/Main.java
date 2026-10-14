package org.example;

public class Main {
    public static void main(String[] args) {
        //Con Builder
//        Marcas marcas = Marcas.builder()
//                .id(1L)
//                .nombre("Toyota")
//                .estado(true)
//                .build();
//        System.out.println(marcas.getNombre());
//        System.out.println(marcas.getEstado());
        //Sin Builder
        Marcas marcas = new Marcas(1L,"Toyota",true);
        //modificar datos
        marcas.setId(2L);
        marcas.setNombre("Honda");
        marcas.setEstado(true);
        //obtener los datos
        System.out.println(marcas.getId());
        System.out.println(marcas.getNombre());
        System.out.println(marcas.getEstado());
    }
}