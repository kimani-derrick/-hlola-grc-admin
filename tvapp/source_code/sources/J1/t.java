package J1;

import com.boxhdo.android.data.model.response.VoteResponse;
import com.boxhdo.domain.model.Vote;
/* loaded from: classes.dex */
public final class t implements l {
    public static Vote a(VoteResponse voteResponse) {
        long j7;
        long j8;
        M5.g.f(voteResponse, "dto");
        long j9 = 0;
        Long l7 = voteResponse.f7710a;
        if (l7 != null) {
            j7 = l7.longValue();
        } else {
            j7 = 0;
        }
        Long l8 = voteResponse.f7711b;
        if (l8 != null) {
            j8 = l8.longValue();
        } else {
            j8 = 0;
        }
        Long l9 = voteResponse.f7712c;
        if (l9 != null) {
            j9 = l9.longValue();
        }
        return new Vote(j7, j8, j9);
    }

    @Override // J1.l
    public final /* bridge */ /* synthetic */ Object s(Object obj) {
        return a((VoteResponse) obj);
    }
}
