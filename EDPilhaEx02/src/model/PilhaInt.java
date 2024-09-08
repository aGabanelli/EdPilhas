package model;

public class PilhaInt {

	NoInt topo;
	
	public PilhaInt() {
		topo = null;
	}
	
	public Boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		return false;
	}
	
	//Insere um elemento na pilha
	public void Push(int e) {
		NoInt elemento = new NoInt();
		elemento.dado = e;
		if(isEmpty()) {
			topo = elemento;			
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	//Retira o primeiro elemento da pilha
	public int Pop() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos para desempilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	//Captura o primeiro elemento da pilha, mas não o tira
	public int Top() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos na pilha");
		}
		int valor = topo.dado;
		return valor;
	}
	
	//retorna o tamanho da pilha
	public int Size() {
		int cont = 0;
		if(isEmpty() == false) {
			NoInt auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				cont = cont + 1;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	//retorna o maior valor da pilha
	public int Max() {
		NoInt auxiliar = topo;
	    int maior = auxiliar.dado;

	    while (auxiliar != null) {
	        if (auxiliar.dado > maior) {
	            maior = auxiliar.dado;
	        }
	        auxiliar = auxiliar.proximo;
	    }
	    return maior;
	}
	
	
}
