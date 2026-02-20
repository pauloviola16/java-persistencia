public class RESUMO {

    /*

     @Entity → vira tabela
     @Table (name = )

    @Id → chave primária

    @GeneratedValue (strategy = ) → auto incremento

    @Column (nullable = false, unique = true)


    1 - RELACIONAMENTOS

   @OneToOne

   @OneToMany - one é do lado da classe em que você está anotando
   no ex de itens de pedidos
   na classe Pedido vai ter:

   @OneToMany(mappedBy = "pedido")
   private List<ItemPedido> itens;
   porque um pedido tem varios itens de pedido

   @ManyToOne - many é do lado da classe em que você está anotando e one é o atributo
   ex: Pedido, ItemPedido -> na classe ItemPedido vai ter o atributo:

   @ManyToOne
   private Pedido pedido
   porque um pedido tem many itens pedidos


   @ManyToMany


   @JoinColumn - @JoinColumn define a coluna da tabela que contém a chave estrangeira, que liga a entidade atual a outra entidade.
   Sem ele, o JPA cria uma coluna com nome padrão, mas muitas vezes queremos controlar o nome ou outras propriedades da coluna
    ex:
    @ManyToOne
    @JoinColumn(name = "cliente_id") // coluna que referencia a tabela Cliente
    private Cliente cliente;


   @MappedBy


   2 - ENTITY MANAGER.
    ex: entityManager.persist(usuário)

   PERSIST - SALVA ENTIDADE NOVA, FAZ UM INSERT, SÓ FUNCIONA EM OBJETO NOVO

   MERGE - ATUALIZA UMA ENTIDADE, FAZ UM UPDATE

   FIND - BUSCA PELO ID

   REMOVE - REMOVE A ENTIDADE

   CLOSE - FECHA O EM



  3 - FETCH TYPE - DEFINE QUANDO O JPA CARREGA ENTIDADES RELACIONADAS
  FetchType.EAGER
  FetchType.LAZY

  EAGER - CARREGA IMEDIATAMENTE

  LAZY - CARREGA APENAS QUANDO ACESSAR



 4 - CASCADE

 🔹 CascadeType.PERSIST - Salva filhos junto com o pai

🔹 CascadeType.MERGE - Atualiza filhos junto

🔹 CascadeType.REMOVE - Remove filhos automaticamente

🔹 CascadeType.ALL
 Aplica tudo:
persist
merge
remove
refresh
detach
 Use só quando:

Relacionamento é forte (ex: Pedido → ItemPedido)


5 - JPQL



6 - Anotações importantes

@Transient - indica um atributo para o jpa ignorar e não salvar no banco de dados, ex: repeated password

@Embedded / @Embeddable

@Temporal - @Temporal define como um campo java.util.Date ou Calendar será armazenado no banco.
@Temporal(TemporalType.DATE)      // só data
@Temporal(TemporalType.TIME)      // só hora
@Temporal(TemporalType.TIMESTAMP) // data + hora

@Lob - indica que o campo será armazenado como um LOB (Large Object) no banco.
Usado para dados grandes, como:
Textos longos
Arquivos
Imagens
PDFs
JSONs grandes


*/

}
