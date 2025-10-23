package w1;

import com.boxhdo.domain.model.Movie;
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f15725a;

    public m(Movie movie) {
        M5.g.f(movie, "movie");
        this.f15725a = movie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && M5.g.a(this.f15725a, ((m) obj).f15725a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15725a.hashCode();
    }

    public final String toString() {
        return "Update(movie=" + this.f15725a + ")";
    }
}
