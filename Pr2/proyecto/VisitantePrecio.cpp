#include <iostream>
#include "ComponenteEquipo.cpp"
#include "vector"

using namespace std;

class VisitantePrecio
{
private:
    int clasificacion;
    double total, totalEstu, totalMayor;

public:
    void Visitar(ComponenteEquipo elemento)
    {
        total += elemento.getCosto();
        totalEstu += elemento.getCosto() * 0.90;
        totalMayor += elemento.getCosto() * 0.85;
    }

    void Visitar(Disco disco)
    {
        total += disco.getCosto();
        totalEstu += disco.getCosto() * 0.90;
        totalMayor += disco.getCosto() * 0.85;
    }

    void Visitar(Equipo eq)
    {
        eq.Aceptar(*this);
    }

    void Visitar(Tarjeta tarje)
    {
        total += tarje.getCosto();
        totalEstu += tarje.getCosto() * 0.90;
        totalMayor += tarje.getCosto() * 0.85;
    }

    void Visitar(Bus bus)
    {
        total += bus.getCosto();
        totalEstu += bus.getCosto() * 0.90;
        totalMayor += bus.getCosto() * 0.85;
    }

    string toString()
    {
        string aDevolver;
        aDevolver.append("El valor total del Equipo: ");
        aDevolver.append(to_string(total));
        aDevolver.append("\nEl valor total para estudiantes (10% off): ");
        aDevolver.append(to_string(totalEstu));
        aDevolver.append("\nEl valor total para mayoristas (15% off): ");
        aDevolver.append(to_string(totalMayor));

        return aDevolver;
    }
};
