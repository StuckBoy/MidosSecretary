package interfaces;

import pojos.Demon;

/**
 * Classes implementing this interface will support the ability to verify if a
 * given {@link Demon} can fuse with the implementor, in addition to computing
 * which {@link Demon} that particular fusion will result in.
 */
public interface Fusable {

    /**
     * Verifies whether the current {@link Demon} can be fused with the given
     * {@link Demon}
     * @param aDemon The {@link Demon} attempting to be fused with.
     * @return a {@code True} if the current {@link Demon} can be fused with the
     * given one, {@code False} if not.
     */
    Boolean canBeFused(Demon aDemon);

    /**
     * Attempts to fuse the current {@link Demon} with the provided one. If it
     * cannot be fused, an error will print to indicate as such.
     * @param aDemon The {@link Demon} to be fused with.
     * @return the resulting {@link Demon} from the fusion if one is able to be
     * created.
     */
    Demon fuseWith(Demon aDemon);
}
