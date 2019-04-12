package lab05;

import java.util.Arrays;

public class Lab05
{
    public static void main(String[] args)
    {
        int vNumero[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int vModulo[] = new int[vNumero.length];
        int m = 3;

        for (int i = 0; i < vNumero.length; i++)
        {            
            vModulo[i] = vNumero[i] % m;
        }
            
        System.out.println("[Vetor de Números]");
        imprimirVetor(vNumero);
        
        System.out.println("\n[Vetor de Módulos]");
        imprimirVetor(vModulo);
        
        MergeSort ms = new MergeSort(m);
        ms.ordenar(0,vNumero.length,vNumero, m);
        
        System.out.println("\n[Vetor de Números Ordenado pelo Módulo]");
        imprimirVetor(vNumero);
    }
    
    public static void imprimirVetor(int a[])
    {
        System.out.println(Arrays.toString(a));
    }
}