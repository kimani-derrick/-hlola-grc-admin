package D1;

import com.boxhdo.domain.model.Episode;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Season;
import com.boxhdo.domain.model.Subtitle;
import com.boxhdo.domain.model.SubtitleSource;
import w0.AbstractC1348b;
/* loaded from: classes.dex */
public final class b extends AbstractC1348b {
    public final /* synthetic */ int d;

    @Override // w0.AbstractC1348b
    public final boolean a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return M5.g.a((Subtitle) obj, (Subtitle) obj2);
            case 1:
                return M5.g.a((SubtitleSource) obj2, (SubtitleSource) obj);
            case 2:
                return M5.g.a((Episode) obj, (Episode) obj2);
            case 3:
                return M5.g.a((Season) obj, (Season) obj2);
            default:
                return M5.g.a(((Movie) obj).f8031s, ((Movie) obj2).f8031s);
        }
    }

    @Override // w0.AbstractC1348b
    public final boolean b(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return M5.g.a(((Subtitle) obj).f8073a, ((Subtitle) obj2).f8073a);
            case 1:
                if (((SubtitleSource) obj2).f8076q == ((SubtitleSource) obj).f8076q) {
                    return true;
                }
                return false;
            case 2:
                if (((Episode) obj).f7966q == ((Episode) obj2).f7966q) {
                    return true;
                }
                return false;
            case 3:
                if (((Season) obj).f8055q == ((Season) obj2).f8055q) {
                    return true;
                }
                return false;
            default:
                if (((Movie) obj).f8029q == ((Movie) obj2).f8029q) {
                    return true;
                }
                return false;
        }
    }
}
