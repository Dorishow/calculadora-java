public class Operacoes {
    public double somar(double a, double b){
        return a + b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b){
        return a / b;
    }

    public double porcentagem(double parcela, double total){
        return parcela * 100 / total;
    }

    public double raizQuadrada(double a){
        return Math.sqrt(a);
    }

    public double exponenciarQuadrado(double a){
        return a * a;
    }

    public double calcular(String operacao, double a, double b) {
        double result = 0;
        switch (operacao){
            case "soma":
                result = somar(a, b);
                break;
            case "subtração":
                result = subtrair(a, b);
                break;
            case "multiplicação":
                result = multiplicar(a, b);
                break;
            case "divisão":
                result = dividir(a, b);
                break;
            case "porcentagem":
                result = porcentagem(a, b);
                break;
            case "raiz":
                result = raizQuadrada(a);
                break;
            case "potência":
                result = exponenciarQuadrado(a);
                break;
        };
        return result;
    }
}
