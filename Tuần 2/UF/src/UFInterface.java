package UF;

public interface UFInterface {
    public void union(int p, int q);

    public int find(int p);

    public boolean connected(int p, int q);

}