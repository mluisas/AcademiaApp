package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.dto.atividadeExtra.AtividadeExtraRequestDto;
import letscode.projetostreinamento.academiaapp.dto.atividadeExtra.AtividadeExtraResponseDto;
import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;
import letscode.projetostreinamento.academiaapp.service.AtividadesExtraService;
import org.springframework.http.MediaType;
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

    @GetMapping("/{cpf}")
    public ResponseEntity<List<AtividadeExtraResponseDto>> listAllAtividadesExtra(@PathParam("cpf") String cpf){
        return ResponseEntity.ok(atividadesExtraService.listAllAtividadesExtra(cpf));
    }

    @PostMapping
    public ResponseEntity<AtividadesExtra> addAtividadesExtra(@RequestBody AtividadeExtraRequestDto atividadesExtraDto){
        return ResponseEntity.ok(atividadesExtraService.addAtividadesExtra(atividadesExtraDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathParam("id") Integer id) {
        atividadesExtraService.delete(id);
    }

}
