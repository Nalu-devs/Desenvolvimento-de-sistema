package projeto;
public class Projeto {
    public static void main(String[] args) {
        Produto p;
        p = new Produto();
        p.setId(1);
        p.setNome("Camiseta");
        p.setDescricao("Camiseta florida do Balu");
        
        System.out.println("O id: "+p.getId());
        System.out.println("O nome: "+p.getNome());
        System.out.println("A descrição: "+p.getDescricao());
        
        Produto p2 = new Produto();
        
        p2.setId(100);
        p2.setNome("Margarida");
        p2.setDescricao("Margarida do Milo");
        
        System.out.println("O id: "+p2.getId());
        System.out.println("O nome: "+p2.getNome());
        System.out.println("A descrição: "+p2.getDescricao());
    }
}