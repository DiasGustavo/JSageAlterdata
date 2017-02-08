/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.teste;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author Gustavo
 */
public class GerarCodigoEmpresa {
    public static void main (String args[]){
        String codigo = "10";
        codigo = StringUtils.leftPad(codigo, 5, "0");
        System.out.println(codigo);
    }
    
}
