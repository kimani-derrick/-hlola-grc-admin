package E1;

import com.boxhdo.domain.model.Movie;
/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f560a;

    public n(Movie movie) {
        M5.g.f(movie, "movie");
        this.f560a = movie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && M5.g.a(this.f560a, ((n) obj).f560a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f560a.hashCode();
    }

    public final String toString() {
        return "Update(movie=" + this.f560a + ")";
    }
}
