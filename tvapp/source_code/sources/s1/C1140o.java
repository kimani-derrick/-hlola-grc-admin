package s1;

import com.boxhdo.domain.model.Movie;
/* renamed from: s1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140o extends AbstractC1141p {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f13567a;

    public C1140o(Movie movie) {
        M5.g.f(movie, "movie");
        this.f13567a = movie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1140o) && M5.g.a(this.f13567a, ((C1140o) obj).f13567a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13567a.hashCode();
    }

    public final String toString() {
        return "Update(movie=" + this.f13567a + ")";
    }
}
