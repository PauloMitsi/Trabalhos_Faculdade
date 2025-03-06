/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.secproj;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerPes {

	private Pessoa pes;
	private final List<Pessoa> bdPes = new ArrayList<>();

	public List<Pessoa> getBdPes() {
		return bdPes;
	}

	public Pessoa cadPes(Pessoa pes) {

		if (consPesCod(pes) == null) {
			bdPes.add(pes);
			return pes;
		} else {
			return null;
		}

	}// fim cadPes

	public Pessoa consPesCod(Pessoa pes) {
		for (int i = 0; i < bdPes.size(); i++) {
			if (pes.getCpf() == bdPes.get(i).getCpf()) {
				return bdPes.get(i);
			}
		}
		return null;
	}// fim consPesCod

	public Pessoa removePesCod(Pessoa pes) {
		pes = consPesCod(pes);
		if (pes != null) {
			bdPes.remove(pes);
			return null;
		} else {
			return pes;
		}

	}// fim removePesCod

	public Pessoa atualizaPesCod(Pessoa pes) {
		for (int i = 0; i < bdPes.size(); i++) {
			if (pes.getCpf() == bdPes.get(i).getCpf()) {
				String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome",
						"Autalização", JOptionPane.QUESTION_MESSAGE);
				pes.setNome(nome);
				bdPes.set(i, pes);
				return bdPes.get(i);
			}
		}
		return null;
	}// fim atualizaPesCod

}// fim da classe
