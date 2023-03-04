package crud;

public class PessoaDAOImpl implements PessoaDAO{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void salvar(Pessoa pessoa){
        hibernateTemplate.sabe(pessoa);
    }

    public Pessoa buscarPorId(int id){
        return hibernateTemplate.get(Pessoa.class, id);
    }

    @Override
    public List<Pessoa> buscarTodos(){
        return hibernateTemplate.loadAll(Pessoa.class);
    }

    @Override
    public void atualizar(Pessoa pessoa){
        hibernateTemplate.delete(pessoa);
    }
}