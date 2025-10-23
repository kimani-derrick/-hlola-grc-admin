package v1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.domain.model.Movie;
import java.io.Serializable;
import n0.InterfaceC1016g;
/* loaded from: classes.dex */
public final class l implements InterfaceC1016g {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f15270a;

    public l(Movie movie) {
        this.f15270a = movie;
    }

    public static final l fromBundle(Bundle bundle) {
        M5.g.f(bundle, "bundle");
        bundle.setClassLoader(l.class.getClassLoader());
        if (bundle.containsKey("movie")) {
            if (!Parcelable.class.isAssignableFrom(Movie.class) && !Serializable.class.isAssignableFrom(Movie.class)) {
                throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Movie movie = (Movie) bundle.get("movie");
            if (movie != null) {
                return new l(movie);
            }
            throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && M5.g.a(this.f15270a, ((l) obj).f15270a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15270a.hashCode();
    }

    public final String toString() {
        return "TvMovieDetailFragmentArgs(movie=" + this.f15270a + ")";
    }
}
