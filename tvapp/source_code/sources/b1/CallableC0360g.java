package b1;

import android.database.Cursor;
import c1.C0389c;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p6.l;
import w4.l0;
import x0.C1458n;
/* renamed from: b1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0360g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1458n f7057b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0361h f7058c;

    public /* synthetic */ CallableC0360g(C0361h c0361h, C1458n c1458n, int i7) {
        this.f7056a = i7;
        this.f7058c = c0361h;
        this.f7057b = c1458n;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor H6;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        Long valueOf;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        Long valueOf2;
        switch (this.f7056a) {
            case 0:
                H6 = l0.H(this.f7058c.f7059a, this.f7057b);
                try {
                    int s6 = l.s(H6, "movie_id");
                    int s7 = l.s(H6, "tmdb_id");
                    int s8 = l.s(H6, "overview");
                    int s9 = l.s(H6, "title");
                    int s10 = l.s(H6, "type");
                    int s11 = l.s(H6, "poster_url");
                    int s12 = l.s(H6, "backdrop_url");
                    int s13 = l.s(H6, "release_date");
                    int s14 = l.s(H6, "countries");
                    int s15 = l.s(H6, "genres");
                    int s16 = l.s(H6, "id");
                    ArrayList arrayList = new ArrayList(H6.getCount());
                    while (H6.moveToNext()) {
                        long j7 = H6.getLong(s6);
                        long j8 = H6.getLong(s7);
                        if (H6.isNull(s8)) {
                            string = null;
                        } else {
                            string = H6.getString(s8);
                        }
                        if (H6.isNull(s9)) {
                            string2 = null;
                        } else {
                            string2 = H6.getString(s9);
                        }
                        if (H6.isNull(s10)) {
                            string3 = null;
                        } else {
                            string3 = H6.getString(s10);
                        }
                        if (H6.isNull(s11)) {
                            string4 = null;
                        } else {
                            string4 = H6.getString(s11);
                        }
                        if (H6.isNull(s12)) {
                            string5 = null;
                        } else {
                            string5 = H6.getString(s12);
                        }
                        if (H6.isNull(s13)) {
                            string6 = null;
                        } else {
                            string6 = H6.getString(s13);
                        }
                        if (H6.isNull(s14)) {
                            string7 = null;
                        } else {
                            string7 = H6.getString(s14);
                        }
                        if (H6.isNull(s15)) {
                            string8 = null;
                        } else {
                            string8 = H6.getString(s15);
                        }
                        if (H6.isNull(s16)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(H6.getLong(s16));
                        }
                        arrayList.add(new C0389c(j7, j8, string, string2, string3, string4, string5, string6, string7, string8, valueOf));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                H6 = l0.H(this.f7058c.f7059a, this.f7057b);
                try {
                    int s17 = l.s(H6, "movie_id");
                    int s18 = l.s(H6, "tmdb_id");
                    int s19 = l.s(H6, "overview");
                    int s20 = l.s(H6, "title");
                    int s21 = l.s(H6, "type");
                    int s22 = l.s(H6, "poster_url");
                    int s23 = l.s(H6, "backdrop_url");
                    int s24 = l.s(H6, "release_date");
                    int s25 = l.s(H6, "countries");
                    int s26 = l.s(H6, "genres");
                    int s27 = l.s(H6, "id");
                    ArrayList arrayList2 = new ArrayList(H6.getCount());
                    while (H6.moveToNext()) {
                        long j9 = H6.getLong(s17);
                        long j10 = H6.getLong(s18);
                        if (H6.isNull(s19)) {
                            string9 = null;
                        } else {
                            string9 = H6.getString(s19);
                        }
                        if (H6.isNull(s20)) {
                            string10 = null;
                        } else {
                            string10 = H6.getString(s20);
                        }
                        if (H6.isNull(s21)) {
                            string11 = null;
                        } else {
                            string11 = H6.getString(s21);
                        }
                        if (H6.isNull(s22)) {
                            string12 = null;
                        } else {
                            string12 = H6.getString(s22);
                        }
                        if (H6.isNull(s23)) {
                            string13 = null;
                        } else {
                            string13 = H6.getString(s23);
                        }
                        if (H6.isNull(s24)) {
                            string14 = null;
                        } else {
                            string14 = H6.getString(s24);
                        }
                        if (H6.isNull(s25)) {
                            string15 = null;
                        } else {
                            string15 = H6.getString(s25);
                        }
                        if (H6.isNull(s26)) {
                            string16 = null;
                        } else {
                            string16 = H6.getString(s26);
                        }
                        if (H6.isNull(s27)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(H6.getLong(s27));
                        }
                        arrayList2.add(new C0389c(j9, j10, string9, string10, string11, string12, string13, string14, string15, string16, valueOf2));
                    }
                    return arrayList2;
                } finally {
                }
            default:
                H6 = l0.H(this.f7058c.f7059a, this.f7057b);
                try {
                    Integer num = null;
                    if (H6.moveToFirst() && !H6.isNull(0)) {
                        num = Integer.valueOf(H6.getInt(0));
                    }
                    return num;
                } finally {
                }
        }
    }
}
