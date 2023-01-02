package fr.kira.formation.java;

/**
 * Voici un autre exercice qui pourrait vous aider à comprendre l'importance de l'encapsulation en utilisant l'exemple de la température :
 *
 * Créez une classe nommée Temperature qui représente une température avec la propriété suivante :
 * une température en kelvin (un flottant)
 * Ajoutez un constructeur à la classe Temperature qui permet de créer une nouvelle instance de la classe en passant la valeur de la température en kelvin en paramètre.
 *
 * Ajoutez des méthodes get et set pour la température en kelvin. Les méthodes get permettent de lire la valeur de la température en kelvin, tandis que les méthodes set permettent de la modifier.
 *
 * Dans le corps de chaque méthode set, ajoutez une vérification pour s'assurer que la valeur de la température en kelvin est valide. Par exemple, vous pouvez vérifier que la température est supérieure à 0. Si la valeur n'est pas valide, lancez une exception.
 *
 * Ajoutez des méthodes à la classe Temperature qui permettent de convertir la température en kelvin en d'autres unités de température (celsius, fahrenheit, etc.) et de retourner la valeur convertie. Vous pouvez utiliser les formules suivantes pour les conversions :
 *
 * Copy code
 * celsius = kelvin - 273.15
 * fahrenheit = (9/5) * celsius + 32
 * Créez une classe de test nommée TestTemperature qui crée une instance de la classe Temperature et utilise les méthodes set et get pour modifier et afficher la valeur de la température en kelvin. Utilisez également les méthodes de conversion pour afficher la température dans d'autres unités de mesure. Assurez-vous de tester que les vérifications dans les méthodes set fonctionnent correctement en essayant de définir des valeurs non valides.
 * Cet exercice devrait vous aider à comprendre l'importance de l'encapsulation en vous montrant comment il est possible de cacher l'implémentation interne de la classe Temperature (qui utilise uniquement la température en kelvin) tout en offrant aux utilisateurs de la classe des méthodes pour obtenir et définir la température dans d'autres unités de mesure.
 */
public class Temperature {
    private float kelvin;

    public Temperature(float kelvin) {
        this.kelvin = kelvin;
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setKelvin(float kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("La température en kelvin doit être supérieure à 0");
        }
        this.kelvin = kelvin;
    }

    public float getCelsius() {
        return kelvin - 273.15f;
    }

    public float getFahrenheit() {
        return (9f / 5f) * getCelsius() + 32f;
    }

    public void setFahrenheit(float fahrenheit) {
        setKelvin((fahrenheit - 32f) * 5f / 9f + 273.15f);
    }

    public void setCelsius(float celsius) {
        setKelvin(celsius + 273.15f);
    }

}
