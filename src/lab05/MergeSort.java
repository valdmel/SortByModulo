package lab05;

public class MergeSort
{
    int m;
    
    public MergeSort(int m)
    {
        this.m=m;
    }
    
    public void ordenar(int p, int n, int v[], int m)
    {
        if (p < n - 1)
        {
            int q = (p + n) / 2;

            ordenar(p, q, v, m);
            ordenar(q, n, v, m);
            intercala(p, q, n, v);
        }
    }

    public void intercala(int p, int q, int n, int v[])
    {
        int i = p;
        int j = q;
        int k = 0;
        int w[] = new int[n - p];

        while (i < q && j < n)
        {
            if (compara(v[i], v[j]))
            {
                w[k++] = v[i++];
            }
            else
            {
                w[k++] = v[j++];
            }
        }

        while (i < q)
        {
            w[k++] = v[i++];
        }

        while (j < n)
        {
            w[k++] = v[j++];
        }

        int a;
        int b;

        for (a = 0, b = p; a < k; a++, b++)
        {
            v[b] = w[a];
        }
    }

    public boolean compara(int x, int y)
    {
        if (x % m < y % m)
        {
            return true;
        }

        if (x % m == y % m)
        {
            if (verificaImpar(x) && verificaPar(y))
            {
                return true;
            }

            if (verificaImpar(x) && verificaImpar(y) && (x > y))
            {
                return true;
            }

            if (verificaPar(x) && verificaPar(y) && (x < y))
            {
                return true;
            }
        }

        return false;
    }

    public boolean verificaImpar(int x)
    {
        return x % 2 != 0;
    }

    public boolean verificaPar(int x)
    {
        return x % 2 == 0;
    }
}
