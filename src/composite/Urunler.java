/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Esma Haber
 */

// Somut yapımızdır.
// UML diyagramındaki Leaf kısmına denk gelmektedir.
// Hiyerarşinin en alt tabakasını temsil etmektedir.
class Urunler implements ICatalogComponent {
    private String _name;
    private String _price;

    public Urunler(String name, String price) {
        _name = name;
        _price = price;
    }

    public void drawHierarchy() {
        System.out.println(_name + "     "+ _price);
    }
}