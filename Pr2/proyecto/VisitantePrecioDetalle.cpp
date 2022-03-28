#include <iostream>
#include "ComponenteEquipo.cpp"
#include "vector"

using namespace std;

class VisitantePrecioDetalle
{
private:
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
        total = disco.getCosto();
        totalEstu = disco.getCosto() * 0.90;
        totalMayor = disco.getCosto() * 0.85;
        cout << "El Disco de este equipo tiene los siguientes precios:" << endl
             << "Normal: " << total << endl
             << "Estudiante (10% off): " << totalEstu << endl
             << "Mayorista (15% off); " << totalMayor << endl;
    }

    void Visitar(Equipo eq)
    {
        eq.Aceptar(*this);
        cout << "Visito un Equipo" << endl;
    }

    void Visitar(Tarjeta tarje)
    {
        total = tarje.getCosto();
        totalEstu = tarje.getCosto() * 0.90;
        totalMayor = tarje.getCosto() * 0.85;
        cout << "La tarjeta de este equipo tiene los siguientes precios:" << endl
             << "Normal: " << total << endl
             << "Estudiante (10% off): " << totalEstu << endl
             << "Mayorista (15% off); " << totalMayor << endl;
    }

    void Visitar(Bus bus)
    {
        total = bus.getCosto();
        totalEstu = bus.getCosto() * 0.90;
        totalMayor = bus.getCosto() * 0.85;
        cout << "El Bus de este equipo tiene los siguientes precios:" << endl
             << "Normal: " << total << endl
             << "Estudiante (10% off): " << totalEstu << endl
             << "Mayorista (15% off); " << totalMayor << endl;
    }
};