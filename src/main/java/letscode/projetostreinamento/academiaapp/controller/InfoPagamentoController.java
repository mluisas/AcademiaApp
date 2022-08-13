package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.InfoPagamento;
import letscode.projetostreinamento.academiaapp.service.InfoPagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/info-pagamento")
public class InfoPagamentoController {

    final InfoPagamentoService infoPagamentoService;

    public InfoPagamentoController(InfoPagamentoService infoPagamentoService) {
        this.infoPagamentoService = infoPagamentoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfoPagamento> getInfoPagamento(@PathParam("id") Integer id) {
        return ResponseEntity.ok(infoPagamentoService.getInfoPagamento(id));
    }

    @GetMapping
    public ResponseEntity<List<InfoPagamento>> listAllInfoPagamento(){
        return ResponseEntity.ok(infoPagamentoService.listAllInfoPagamento());
    }

    @PostMapping
    public ResponseEntity<InfoPagamento> addInfoPagamento(@RequestBody InfoPagamento infoPagamento){
        return ResponseEntity.ok(infoPagamentoService.addInfoPagamento(infoPagamento));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathParam("id") Integer id){
        infoPagamentoService.delete(id);
    }
}
