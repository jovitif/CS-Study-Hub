package Questao01;

public interface PilhaInterface <Generico> {
    boolean taCheio();
    boolean taVazio();
	void coloqueAi(Generico number) throws Excessao;
	Generico boraOlharoTopo() throws Excessao;
	Generico tireAi() throws Excessao;
    void vamoMostrar();
    void olhaiTamanho();
    void limparTudo();
}
