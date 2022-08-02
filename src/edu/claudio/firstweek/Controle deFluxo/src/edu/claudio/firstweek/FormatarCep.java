package edu.claudio.firstweek;

public class FormatarCep {
	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("23765068");
			System.out.println(" CEP Formatado:  " + cepFormatado);
		}
		catch(CepInvalidException e) {
			e.printStackTrace();
			System.out.println(" O CEP não corresponde as regras de negócio! ");
		}

	}
	static String formatarCep(String cep) throws CepInvalidException{
		if(cep.length() != 8)
			throw new CepInvalidException();

		//simulando um cep formatado
		return "23.765-064";
	}
}
