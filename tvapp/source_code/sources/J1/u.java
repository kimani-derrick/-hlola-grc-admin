package J1;

import c1.C0389c;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Vote;
import com.boxhdo.domain.type.MediaType;
import java.util.List;
/* loaded from: classes.dex */
public final class u implements l {
    @Override // J1.l
    public final Object s(Object obj) {
        MediaType mediaType;
        C0389c c0389c = (C0389c) obj;
        M5.g.f(c0389c, "dto");
        MediaType[] values = MediaType.values();
        int length = values.length;
        int i7 = 0;
        while (true) {
            if (i7 < length) {
                mediaType = values[i7];
                if (M5.g.a(mediaType.f8099q, c0389c.f7246e)) {
                    break;
                }
                i7++;
            } else {
                mediaType = null;
                break;
            }
        }
        if (mediaType == null) {
            mediaType = MediaType.f8096s;
        }
        Movie movie = new Movie(c0389c.f7243a, c0389c.f7247g, c0389c.f, c0389c.d, c0389c.f7244b, c0389c.f7245c, c0389c.f7248h, 0, mediaType, (String) null, (String) null, false, 0, 0, (String) null, 0.0d, 0L, (List) null, (List) null, (List) null, (List) null, false, (Vote) null, 16776832);
        String str = c0389c.f7249i;
        M5.g.f(str, "<set-?>");
        movie.f8027O = str;
        String str2 = c0389c.f7250j;
        M5.g.f(str2, "<set-?>");
        movie.f8028P = str2;
        return movie;
    }
}
