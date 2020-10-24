package br.edu.unievangelica.ftt.projeto.domain.garagem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unievangelica.ftt.projeto.core.controller.AbstractController;


@RestController
@RequestMapping("/api/garagem")
public class GaragemController extends AbstractController<Garagem> {

}
