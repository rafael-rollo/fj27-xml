package br.com.cdc.loja.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cdc.loja.daos.ProdutoDao;
import br.com.cdc.loja.models.Produto;
import br.com.cdc.loja.models.TipoDeLivro;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoDao produtoDao;

	@RequestMapping(method = RequestMethod.GET, value = "/form")
	public ModelAndView form() {
		return new ModelAndView("produto/form")
			.addObject("tiposDeLivro", TipoDeLivro.values());
	}

	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public String save(Produto produto) {
		produtoDao.save(produto);
		return "redirect:/produto";
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("produto/lista")
			.addObject("produtos", produtoDao.lista());
	}
}
