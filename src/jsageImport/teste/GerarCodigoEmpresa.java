/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.teste;
import jsageImport.modelo.persistencia.TratamentoDados;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author Gustavo
 */
public class GerarCodigoEmpresa {
    public static void main (String args[]){
        
        TratamentoDados trataDados = new TratamentoDados();
        
        
        
        System.out.println(trataDados.preencherStringEsquerda(10, "0"));
    }
    
}
