package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.dto.treino.TreinoRequestDto;
import letscode.projetostreinamento.academiaapp.dto.treino.TreinoResponseDto;
import letscode.projetostreinamento.academiaapp.models.Treino;
import letscode.projetostreinamento.academiaapp.service.TreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/treino")
public class TreinoController {
    final TreinoService treinoService;

    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Treino> getTreino(@PathParam("id") Integer id){
        return ResponseEntity.ok(treinoService.getTreino(id));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<TreinoResponseDto>> listAllTreino(@PathParam("cpf") String cpf){
        return ResponseEntity.ok(treinoService.listAllTreino(cpf));
    }

    @PostMapping
    public ResponseEntity<TreinoResponseDto> addTreino(@RequestBody TreinoRequestDto treinoRequestDto){
        return ResponseEntity.ok(treinoService.addTreino(treinoRequestDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathParam("id") Integer id){
        treinoService.delete(id);
    }
}
