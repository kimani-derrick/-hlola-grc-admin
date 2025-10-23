package h1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Movie;
import java.io.Serializable;
import n0.w;
/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f10962a;

    public m(Movie movie) {
        M5.g.f(movie, "movie");
        this.f10962a = movie;
    }

    @Override // n0.w
    public final int a() {
        return R.id.goToDetail;
    }

    @Override // n0.w
    public final Bundle b() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Movie.class);
        Movie movie = this.f10962a;
        if (isAssignableFrom) {
            M5.g.d(movie, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("movie", movie);
        } else if (Serializable.class.isAssignableFrom(Movie.class)) {
            M5.g.d(movie, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("movie", (Serializable) movie);
        } else {
            throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && M5.g.a(this.f10962a, ((m) obj).f10962a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10962a.hashCode();
    }

    public final String toString() {
        return "GoToDetail(movie=" + this.f10962a + ")";
    }
}
