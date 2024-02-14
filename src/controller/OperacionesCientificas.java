package controller;

public interface OperacionesCientificas {
    public float potenciaDosNum(float base, float exponente, char opcionMul);
    public float potenciaResNum(float exponente);
    public float senoDosNum(float angulo, float radianes);
    public float senoResNum(float radianes);
    public float cosenoDosNum(float angulo, float radianes);
    public float cosenoResNum(float radianes);
    public float tangenteDosNum(float angulo, float radianes);
    public float tangenteResNum(float radianes);
    public float factorialDosNum(float n);
    public float factorialResNum();
}
