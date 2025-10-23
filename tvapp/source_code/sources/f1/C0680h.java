package f1;

import W5.InterfaceC0116x;
import android.database.Cursor;
import b1.C0356c;
import c1.C0387a;
import com.boxhdo.android.data.local.AppDatabase;
import java.util.ArrayList;
import k3.AbstractC0958a;
import w4.l0;
import x0.C1458n;
import z5.C1530l;
/* renamed from: f1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Long f10268u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10269v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Long f10270w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0680h(Long l7, C0694v c0694v, Long l8, D5.d dVar) {
        super(2, dVar);
        this.f10268u = l7;
        this.f10269v = c0694v;
        this.f10270w = l8;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0680h(this.f10268u, this.f10269v, this.f10270w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0680h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        C1458n c1458n;
        int s6;
        int s7;
        int s8;
        int s9;
        int s10;
        int s11;
        int s12;
        int s13;
        int s14;
        int s15;
        int s16;
        int s17;
        int s18;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Float valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        Float valueOf5;
        Long valueOf6;
        long j7;
        C1458n c1458n2;
        int s19;
        int s20;
        int s21;
        int s22;
        int s23;
        int s24;
        int s25;
        int s26;
        int s27;
        int s28;
        int s29;
        int s30;
        int s31;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        Float valueOf7;
        Long valueOf8;
        Long valueOf9;
        Long valueOf10;
        Float valueOf11;
        Long valueOf12;
        AbstractC0958a.H(obj);
        C0694v c0694v = this.f10269v;
        Long l7 = this.f10268u;
        if (l7 != null) {
            C0356c c0356c = c0694v.f10325e;
            long longValue = l7.longValue();
            Long l8 = this.f10270w;
            if (l8 != null) {
                j7 = l8.longValue();
            } else {
                j7 = 0;
            }
            long j8 = j7;
            c0356c.getClass();
            C1458n a7 = C1458n.a("SELECT * FROM tbl_continue_watch WHERE movie_id = ? AND season_number = ?", 2);
            a7.P(longValue, 1);
            a7.P(j8, 2);
            AppDatabase appDatabase = c0356c.f7045a;
            appDatabase.b();
            Cursor H6 = l0.H(appDatabase, a7);
            try {
                s19 = p6.l.s(H6, "movie_id");
                s20 = p6.l.s(H6, "movie_name");
                s21 = p6.l.s(H6, "poster_path");
                s22 = p6.l.s(H6, "backdrop_path");
                s23 = p6.l.s(H6, "overview");
                s24 = p6.l.s(H6, "release_date");
                s25 = p6.l.s(H6, "rating");
                s26 = p6.l.s(H6, "episode_id");
                s27 = p6.l.s(H6, "season_number");
                s28 = p6.l.s(H6, "episode_number");
                s29 = p6.l.s(H6, "time");
                s30 = p6.l.s(H6, "percent");
                s31 = p6.l.s(H6, "tmdb_id");
                c1458n2 = a7;
            } catch (Throwable th) {
                th = th;
                c1458n2 = a7;
            }
            try {
                ArrayList arrayList = new ArrayList(H6.getCount());
                while (H6.moveToNext()) {
                    long j9 = H6.getLong(s19);
                    if (H6.isNull(s20)) {
                        string6 = null;
                    } else {
                        string6 = H6.getString(s20);
                    }
                    if (H6.isNull(s21)) {
                        string7 = null;
                    } else {
                        string7 = H6.getString(s21);
                    }
                    if (H6.isNull(s22)) {
                        string8 = null;
                    } else {
                        string8 = H6.getString(s22);
                    }
                    if (H6.isNull(s23)) {
                        string9 = null;
                    } else {
                        string9 = H6.getString(s23);
                    }
                    if (H6.isNull(s24)) {
                        string10 = null;
                    } else {
                        string10 = H6.getString(s24);
                    }
                    if (H6.isNull(s25)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Float.valueOf(H6.getFloat(s25));
                    }
                    long j10 = H6.getLong(s26);
                    if (H6.isNull(s27)) {
                        valueOf8 = null;
                    } else {
                        valueOf8 = Long.valueOf(H6.getLong(s27));
                    }
                    if (H6.isNull(s28)) {
                        valueOf9 = null;
                    } else {
                        valueOf9 = Long.valueOf(H6.getLong(s28));
                    }
                    if (H6.isNull(s29)) {
                        valueOf10 = null;
                    } else {
                        valueOf10 = Long.valueOf(H6.getLong(s29));
                    }
                    if (H6.isNull(s30)) {
                        valueOf11 = null;
                    } else {
                        valueOf11 = Float.valueOf(H6.getFloat(s30));
                    }
                    if (H6.isNull(s31)) {
                        valueOf12 = null;
                    } else {
                        valueOf12 = Long.valueOf(H6.getLong(s31));
                    }
                    arrayList.add(new C0387a(j9, string6, string7, string8, string9, string10, valueOf7, j10, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12));
                }
                H6.close();
                c1458n2.h();
                return new Y0.b(arrayList);
            } catch (Throwable th2) {
                th = th2;
                H6.close();
                c1458n2.h();
                throw th;
            }
        }
        C0356c c0356c2 = c0694v.f10325e;
        Integer num = new Integer(20);
        c0356c2.getClass();
        C1458n a8 = C1458n.a("SELECT *, MAX(season_number), MAX(episode_id) FROM tbl_continue_watch GROUP BY movie_id LIMIT ?", 1);
        a8.P(num.intValue(), 1);
        AppDatabase appDatabase2 = c0356c2.f7045a;
        appDatabase2.b();
        Cursor H7 = l0.H(appDatabase2, a8);
        try {
            s6 = p6.l.s(H7, "movie_id");
            s7 = p6.l.s(H7, "movie_name");
            s8 = p6.l.s(H7, "poster_path");
            s9 = p6.l.s(H7, "backdrop_path");
            s10 = p6.l.s(H7, "overview");
            s11 = p6.l.s(H7, "release_date");
            s12 = p6.l.s(H7, "rating");
            s13 = p6.l.s(H7, "episode_id");
            s14 = p6.l.s(H7, "season_number");
            s15 = p6.l.s(H7, "episode_number");
            s16 = p6.l.s(H7, "time");
            s17 = p6.l.s(H7, "percent");
            s18 = p6.l.s(H7, "tmdb_id");
            c1458n = a8;
        } catch (Throwable th3) {
            th = th3;
            c1458n = a8;
        }
        try {
            ArrayList arrayList2 = new ArrayList(H7.getCount());
            while (H7.moveToNext()) {
                long j11 = H7.getLong(s6);
                if (H7.isNull(s7)) {
                    string = null;
                } else {
                    string = H7.getString(s7);
                }
                if (H7.isNull(s8)) {
                    string2 = null;
                } else {
                    string2 = H7.getString(s8);
                }
                if (H7.isNull(s9)) {
                    string3 = null;
                } else {
                    string3 = H7.getString(s9);
                }
                if (H7.isNull(s10)) {
                    string4 = null;
                } else {
                    string4 = H7.getString(s10);
                }
                if (H7.isNull(s11)) {
                    string5 = null;
                } else {
                    string5 = H7.getString(s11);
                }
                if (H7.isNull(s12)) {
                    valueOf = null;
                } else {
                    valueOf = Float.valueOf(H7.getFloat(s12));
                }
                long j12 = H7.getLong(s13);
                if (H7.isNull(s14)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(H7.getLong(s14));
                }
                if (H7.isNull(s15)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(H7.getLong(s15));
                }
                if (H7.isNull(s16)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(H7.getLong(s16));
                }
                if (H7.isNull(s17)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Float.valueOf(H7.getFloat(s17));
                }
                if (H7.isNull(s18)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(H7.getLong(s18));
                }
                arrayList2.add(new C0387a(j11, string, string2, string3, string4, string5, valueOf, j12, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6));
            }
            H7.close();
            c1458n.h();
            return new Y0.b(arrayList2);
        } catch (Throwable th4) {
            th = th4;
            H7.close();
            c1458n.h();
            throw th;
        }
    }
}
