package com.example.android.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void suma_de_numeros_correctamente(){
        assertEquals(5,Metodos.sumar(3,2),0);
    }

    @Test
    public void suma_de_numeros_incorrecta(){
        assertNotEquals(4,Metodos.sumar(3,2),0);
    }

    @Test
    public void resta_de_numeros_correctamente(){
        assertEquals(1,Metodos.restar(3,2),0);
    }

    @Test
    public void resta_de_numeros_incorrecta(){
        assertNotEquals(4,Metodos.restar(3,2),0);
    }

    @Test
    public void multiplicacion_de_numeros_correctamente(){
        assertEquals(6,Metodos.multiplicar(3,2),0);
    }

    @Test
    public void multiplicacion_de_numeros_incorrecta(){
        assertNotEquals(4,Metodos.multiplicar(3,2),0);
    }

    @Test
    public void division_de_numeros_correctamente(){
        assertEquals(3,Metodos.dividir(6,2),0);
    }

    @Test
    public void division_de_numeros_incorrecta(){
        assertNotEquals(4,Metodos.dividir(3,2),0);
    }

    @Test
    public void division_entre_cero_correcta(){
       assertTrue(Metodos.validarDivision(0,3));
    }

    @Test
    public void division_entre_cero_incorrecta(){
        assertFalse(Metodos.validarDivision(0,2));
    }

    @Test
    public void division_entre_cero_incorrecta2(){
        assertFalse(Metodos.validarDivision(2,3));
    }



}