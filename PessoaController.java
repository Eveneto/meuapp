@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaDAO pessoaDAO;

    @PostMapping
    public ResponseEntity<Pessoa> adicionarPessoa(@RequestBody Pessoa pessoa) {
        pessoaDAO.salvar(pessoa);
        // enviar sms
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
        Pessoa pessoa = pessoaDAO.buscarPorId(id);
        if (pessoa != null) {
            return ResponseEntity.ok(pessoa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Pessoa> buscarTodos() {
        return pessoaDAO.buscarTodos();
    }

    @PutMapping("/{id
