package com.shaquilfaizal.JokesApp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {

	// @Autowired
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {

		return chuckNorrisQuotes.getRandomQuote();
	}

}
