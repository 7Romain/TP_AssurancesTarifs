package fr.oz;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int conducteur = 0;

        final int ROUGE = 1;
        final int ORANGE = 2;
        final int VERT = 3;
        final int BLEU = 4;

        if (JOptionPane.showConfirmDialog(null, "Le conducteur a-t-il plus de 25 ans ?", "Devis d'assurance.",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            conducteur++;
        }

        if (JOptionPane.showConfirmDialog(null, "Le conducteur a-t-il le permis depuis plus de 2 ans ?",
                "Devis d'assurance.",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            conducteur++;
            if (JOptionPane.showConfirmDialog(null, "Le conducteur est-il entré dans la maison depuis plus de 5 ans ?",
                    "Devis d'assurance.",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                conducteur++;
            }
        }

        if (JOptionPane.showConfirmDialog(null, "Le conducteur a-t-il déjà été responsable d'un accident ?",
                "Devis d'assurance.",
                JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            conducteur++;
        } else {
            int accident = Integer.parseInt((JOptionPane.showInputDialog(null,
                    "Combien d'accident a provoqué le conducteur ?", "Devis d'assurance.",
                    JOptionPane.QUESTION_MESSAGE)));
            conducteur = 1 + conducteur - accident;
        }

        switch (conducteur) {

            case ROUGE:
                JOptionPane.showMessageDialog(null, "Vous bénéficiez du tarif Rouge.", "Devis d'assurance.",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case ORANGE:
                JOptionPane.showMessageDialog(null, "Vous bénéficiez du tarif Orange.", "Devis d'assurance.",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case VERT:
                JOptionPane.showMessageDialog(null, "Vous bénéficiez du tarif Vert.", "Devis d'assurance.",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case BLEU:
                JOptionPane.showMessageDialog(null, "Vous bénéficiez du tarif Bleu. Merci pour votre fidélité !",
                        "Devis d'assurance.", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Désolé nous ne pouvons pas vous assurer.", "Devis d'assurance.",
                        JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
