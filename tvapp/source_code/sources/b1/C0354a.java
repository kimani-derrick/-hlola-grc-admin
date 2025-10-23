package b1;

import D0.k;
import c1.C0387a;
import c1.C0388b;
import c1.C0389c;
import com.boxhdo.android.data.local.AppDatabase;
/* renamed from: b1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354a extends Z3.e {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354a(AppDatabase appDatabase, int i7) {
        super(appDatabase);
        this.d = i7;
        M5.g.f(appDatabase, "database");
    }

    @Override // Z3.e
    public final String c() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `tbl_continue_watch` (`movie_id`,`movie_name`,`poster_path`,`backdrop_path`,`overview`,`release_date`,`rating`,`episode_id`,`season_number`,`episode_number`,`time`,`percent`,`tmdb_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `tbl_history` (`movie_id`,`title`,`type`,`poster_url`,`backdrop_url`,`release_date`,`countries`,`genres`,`view_date`) VALUES (?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `tbl_watch_list` (`movie_id`,`tmdb_id`,`overview`,`title`,`type`,`poster_url`,`backdrop_url`,`release_date`,`countries`,`genres`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public final void l(k kVar, Object obj) {
        switch (this.d) {
            case 0:
                C0387a c0387a = (C0387a) obj;
                kVar.P(c0387a.f7225a, 1);
                String str = c0387a.f7226b;
                if (str == null) {
                    kVar.B(2);
                } else {
                    kVar.C(str, 2);
                }
                String str2 = c0387a.f7227c;
                if (str2 == null) {
                    kVar.B(3);
                } else {
                    kVar.C(str2, 3);
                }
                String str3 = c0387a.d;
                if (str3 == null) {
                    kVar.B(4);
                } else {
                    kVar.C(str3, 4);
                }
                String str4 = c0387a.f7228e;
                if (str4 == null) {
                    kVar.B(5);
                } else {
                    kVar.C(str4, 5);
                }
                String str5 = c0387a.f;
                if (str5 == null) {
                    kVar.B(6);
                } else {
                    kVar.C(str5, 6);
                }
                Float f = c0387a.f7229g;
                if (f == null) {
                    kVar.B(7);
                } else {
                    kVar.E(7, f.floatValue());
                }
                kVar.P(c0387a.f7230h, 8);
                Long l7 = c0387a.f7231i;
                if (l7 == null) {
                    kVar.B(9);
                } else {
                    kVar.P(l7.longValue(), 9);
                }
                Long l8 = c0387a.f7232j;
                if (l8 == null) {
                    kVar.B(10);
                } else {
                    kVar.P(l8.longValue(), 10);
                }
                Long l9 = c0387a.f7233k;
                if (l9 == null) {
                    kVar.B(11);
                } else {
                    kVar.P(l9.longValue(), 11);
                }
                Float f7 = c0387a.f7234l;
                if (f7 == null) {
                    kVar.B(12);
                } else {
                    kVar.E(12, f7.floatValue());
                }
                Long l10 = c0387a.f7235m;
                if (l10 == null) {
                    kVar.B(13);
                    return;
                } else {
                    kVar.P(l10.longValue(), 13);
                    return;
                }
            case 1:
                C0388b c0388b = (C0388b) obj;
                kVar.P(c0388b.f7236a, 1);
                String str6 = c0388b.f7237b;
                if (str6 == null) {
                    kVar.B(2);
                } else {
                    kVar.C(str6, 2);
                }
                String str7 = c0388b.f7238c;
                if (str7 == null) {
                    kVar.B(3);
                } else {
                    kVar.C(str7, 3);
                }
                String str8 = c0388b.d;
                if (str8 == null) {
                    kVar.B(4);
                } else {
                    kVar.C(str8, 4);
                }
                String str9 = c0388b.f7239e;
                if (str9 == null) {
                    kVar.B(5);
                } else {
                    kVar.C(str9, 5);
                }
                String str10 = c0388b.f;
                if (str10 == null) {
                    kVar.B(6);
                } else {
                    kVar.C(str10, 6);
                }
                String str11 = c0388b.f7240g;
                if (str11 == null) {
                    kVar.B(7);
                } else {
                    kVar.C(str11, 7);
                }
                String str12 = c0388b.f7241h;
                if (str12 == null) {
                    kVar.B(8);
                } else {
                    kVar.C(str12, 8);
                }
                String str13 = c0388b.f7242i;
                if (str13 == null) {
                    kVar.B(9);
                    return;
                } else {
                    kVar.C(str13, 9);
                    return;
                }
            default:
                C0389c c0389c = (C0389c) obj;
                kVar.P(c0389c.f7243a, 1);
                kVar.P(c0389c.f7244b, 2);
                String str14 = c0389c.f7245c;
                if (str14 == null) {
                    kVar.B(3);
                } else {
                    kVar.C(str14, 3);
                }
                String str15 = c0389c.d;
                if (str15 == null) {
                    kVar.B(4);
                } else {
                    kVar.C(str15, 4);
                }
                String str16 = c0389c.f7246e;
                if (str16 == null) {
                    kVar.B(5);
                } else {
                    kVar.C(str16, 5);
                }
                String str17 = c0389c.f;
                if (str17 == null) {
                    kVar.B(6);
                } else {
                    kVar.C(str17, 6);
                }
                String str18 = c0389c.f7247g;
                if (str18 == null) {
                    kVar.B(7);
                } else {
                    kVar.C(str18, 7);
                }
                String str19 = c0389c.f7248h;
                if (str19 == null) {
                    kVar.B(8);
                } else {
                    kVar.C(str19, 8);
                }
                String str20 = c0389c.f7249i;
                if (str20 == null) {
                    kVar.B(9);
                } else {
                    kVar.C(str20, 9);
                }
                String str21 = c0389c.f7250j;
                if (str21 == null) {
                    kVar.B(10);
                } else {
                    kVar.C(str21, 10);
                }
                Long l11 = c0389c.f7251k;
                if (l11 == null) {
                    kVar.B(11);
                    return;
                } else {
                    kVar.P(l11.longValue(), 11);
                    return;
                }
        }
    }

    public final void m(Object obj) {
        k a7 = a();
        try {
            l(a7, obj);
            a7.a();
        } finally {
            j(a7);
        }
    }
}
