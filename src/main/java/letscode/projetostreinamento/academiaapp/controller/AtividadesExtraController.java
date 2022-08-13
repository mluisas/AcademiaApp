package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;
import letscode.projetostreinamento.academiaapp.service.AtividadesExtraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/atividades-extra")
public class AtividadesExtraController {

    final AtividadesExtraService atividadesExtraService;

    public AtividadesExtraController(AtividadesExtraService atividadesExtraService) {
        this.atividadesExtraService = atividadesExtraService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AtividadesExtra> getAtividadesExtra(@PathParam("id") Integer id){
        return ResponseEntity.ok(atividadesExtraService.getAtividadesExtra(id));
    }

    @GetMapping
    public ResponseEntity<List<AtividadesExtra>> listAllAtividadesExtra(){
        return ResponseEntity.ok(atividadesExtraService.listAllAtividadesExtra());
    }

    @PostMapping
    public ResponseEntity<AtividadesExtra> addAtividadesExtra(@RequestBody AtividadesExtra atividadesExtra){
        return ResponseEntity.ok(atividadesExtraService.addAtividadesExtra(atividadesExtra));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathParam("id") Integer id) {
        atividadesExtraService.delete(id);
    }

}
