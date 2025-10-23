package A5;

import V.C0091j;
import V.H;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import com.boxhdo.domain.model.Movie;
import java.io.IOException;
import z5.C1530l;
/* loaded from: classes.dex */
public final class a extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f117r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f118s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Object obj) {
        super(1);
        this.f117r = i7;
        this.f118s = obj;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        switch (this.f117r) {
            case 0:
                if (obj == ((e) this.f118s)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                IOException iOException = (IOException) obj;
                ((L0.g) this.f118s).f1878A = true;
                return C1530l.f16479a;
            case 2:
                R5.c cVar = (R5.c) obj;
                M5.g.f(cVar, "it");
                return U5.f.v0((CharSequence) this.f118s, cVar);
            case 3:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((H) this.f118s).f3533w.f(new C0091j(th));
                }
                Object obj2 = H.f3525A;
                H h7 = (H) this.f118s;
                synchronized (obj2) {
                    H.f3526z.remove(h7.b().getAbsolutePath());
                }
                return C1530l.f16479a;
            case 4:
                Throwable th2 = (Throwable) obj;
                ((e6.i) this.f118s).b();
                return C1530l.f16479a;
            default:
                Movie movie = (Movie) obj;
                M5.g.f(movie, "it");
                ((TvMovieDetailFragment) this.f118s).i0(new h1.m(movie));
                return C1530l.f16479a;
        }
    }
}
