package com.smartech.checkstyledemo.beautiful;

/**
 * Holds secrets well.
 */
public final class GoodSecretHolder {
    /**
     * The warning.
     */
    private static final String WRONG_RIGHTS_RESPONSE = "You shall not pass!";

    /**
     * The secret.
     */
    private final String secret;

    /**
     * The constructor.
     * @param secretValue the secret value
     */
    public GoodSecretHolder(final String secretValue) {
        this.secret = secretValue;
    }

    /**
     * Prints the secret message if hasRights is true.
     * @param hasRights if the rights are present
     * @return the printed secret message or a warning
     */
    public String printSecret(final boolean hasRights) {
        if (!hasRights) {
            return WRONG_RIGHTS_RESPONSE;
        }

        return "Your secret: '" + secret + "', sir!";
    }
}
