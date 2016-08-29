package mz.com.convert.controle.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import mz.com.convet.controle.Convet;

public class ConverteTest {
	@Test
	public void deveConverterNumero1EmRomano(){
		
		Convet converte = new Convet();
		String romano ="I";
		assertEquals(romano ,converte.converteUnidades(1));
        
	}
	@Test
	public void deveconverterNumero50ParaRomano(){
		
		Convet converte = new Convet();
		String romano ="L";
		
		
	}

}
