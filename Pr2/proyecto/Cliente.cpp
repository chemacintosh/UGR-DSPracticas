#include <iostream>
#include "Equipo.cpp"
#include "Tarjeta.cpp"
#include "Bus.cpp"
#include "Disco.cpp"
#include "VisitantePrecio.cpp"
#include "vector"

using namespace std;

class Cliente
{
private:
    vector<Equipo> eqArray;
    VisitantePrecio visitPrecio;

public:
    Cliente();

    Cliente(vector<Equipo> eqN, VisitantePrecio vp)
    {
        eqArray = eqN;
        visitPrecio = vp;
    }

    void crearEquipo(Equipo eqNuevo)
    {
        eqArray.push_back(eqNuevo);
    }

    void ejecutar()
    {

        for (int i = 0; i < eqArray.size(); i++)
        {
            visitPrecio.Visitar(eqArray[i]);
            cout << eqArray[i].getPrecioTotal() << endl;
        }
    }
};