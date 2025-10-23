package s3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h3.AbstractC0748a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class m1 extends AbstractC0748a {
    public static final Parcelable.Creator<m1> CREATOR = new C1199t(4);

    /* renamed from: A  reason: collision with root package name */
    public final String f14122A;

    /* renamed from: B  reason: collision with root package name */
    public final long f14123B;

    /* renamed from: C  reason: collision with root package name */
    public final long f14124C;

    /* renamed from: D  reason: collision with root package name */
    public final int f14125D;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f14126E;
    public final boolean F;

    /* renamed from: G  reason: collision with root package name */
    public final String f14127G;

    /* renamed from: H  reason: collision with root package name */
    public final Boolean f14128H;

    /* renamed from: I  reason: collision with root package name */
    public final long f14129I;

    /* renamed from: J  reason: collision with root package name */
    public final List f14130J;

    /* renamed from: K  reason: collision with root package name */
    public final String f14131K;

    /* renamed from: L  reason: collision with root package name */
    public final String f14132L;

    /* renamed from: M  reason: collision with root package name */
    public final String f14133M;

    /* renamed from: N  reason: collision with root package name */
    public final String f14134N;

    /* renamed from: O  reason: collision with root package name */
    public final boolean f14135O;

    /* renamed from: P  reason: collision with root package name */
    public final long f14136P;

    /* renamed from: Q  reason: collision with root package name */
    public final int f14137Q;

    /* renamed from: R  reason: collision with root package name */
    public final String f14138R;

    /* renamed from: S  reason: collision with root package name */
    public final int f14139S;

    /* renamed from: T  reason: collision with root package name */
    public final long f14140T;

    /* renamed from: U  reason: collision with root package name */
    public final String f14141U;

    /* renamed from: V  reason: collision with root package name */
    public final String f14142V;

    /* renamed from: q  reason: collision with root package name */
    public final String f14143q;

    /* renamed from: r  reason: collision with root package name */
    public final String f14144r;

    /* renamed from: s  reason: collision with root package name */
    public final String f14145s;

    /* renamed from: t  reason: collision with root package name */
    public final String f14146t;

    /* renamed from: u  reason: collision with root package name */
    public final long f14147u;

    /* renamed from: v  reason: collision with root package name */
    public final long f14148v;

    /* renamed from: w  reason: collision with root package name */
    public final String f14149w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f14150x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f14151y;

    /* renamed from: z  reason: collision with root package name */
    public final long f14152z;

    public m1(String str, String str2, String str3, long j7, String str4, long j8, long j9, String str5, boolean z7, boolean z8, String str6, long j10, int i7, boolean z9, boolean z10, String str7, Boolean bool, long j11, List list, String str8, String str9, String str10, boolean z11, long j12, int i8, String str11, int i9, long j13, String str12, String str13) {
        g3.n.c(str);
        this.f14143q = str;
        this.f14144r = TextUtils.isEmpty(str2) ? null : str2;
        this.f14145s = str3;
        this.f14152z = j7;
        this.f14146t = str4;
        this.f14147u = j8;
        this.f14148v = j9;
        this.f14149w = str5;
        this.f14150x = z7;
        this.f14151y = z8;
        this.f14122A = str6;
        this.f14123B = 0L;
        this.f14124C = j10;
        this.f14125D = i7;
        this.f14126E = z9;
        this.F = z10;
        this.f14127G = str7;
        this.f14128H = bool;
        this.f14129I = j11;
        this.f14130J = list;
        this.f14131K = null;
        this.f14132L = str8;
        this.f14133M = str9;
        this.f14134N = str10;
        this.f14135O = z11;
        this.f14136P = j12;
        this.f14137Q = i8;
        this.f14138R = str11;
        this.f14139S = i9;
        this.f14140T = j13;
        this.f14141U = str12;
        this.f14142V = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.M(parcel, 2, this.f14143q);
        AbstractC0189a.M(parcel, 3, this.f14144r);
        AbstractC0189a.M(parcel, 4, this.f14145s);
        AbstractC0189a.M(parcel, 5, this.f14146t);
        AbstractC0189a.R(parcel, 6, 8);
        parcel.writeLong(this.f14147u);
        AbstractC0189a.R(parcel, 7, 8);
        parcel.writeLong(this.f14148v);
        AbstractC0189a.M(parcel, 8, this.f14149w);
        AbstractC0189a.R(parcel, 9, 4);
        parcel.writeInt(this.f14150x ? 1 : 0);
        AbstractC0189a.R(parcel, 10, 4);
        parcel.writeInt(this.f14151y ? 1 : 0);
        AbstractC0189a.R(parcel, 11, 8);
        parcel.writeLong(this.f14152z);
        AbstractC0189a.M(parcel, 12, this.f14122A);
        AbstractC0189a.R(parcel, 13, 8);
        parcel.writeLong(this.f14123B);
        AbstractC0189a.R(parcel, 14, 8);
        parcel.writeLong(this.f14124C);
        AbstractC0189a.R(parcel, 15, 4);
        parcel.writeInt(this.f14125D);
        AbstractC0189a.R(parcel, 16, 4);
        parcel.writeInt(this.f14126E ? 1 : 0);
        AbstractC0189a.R(parcel, 18, 4);
        parcel.writeInt(this.F ? 1 : 0);
        AbstractC0189a.M(parcel, 19, this.f14127G);
        Boolean bool = this.f14128H;
        if (bool != null) {
            AbstractC0189a.R(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AbstractC0189a.R(parcel, 22, 8);
        parcel.writeLong(this.f14129I);
        List<String> list = this.f14130J;
        if (list != null) {
            int P7 = AbstractC0189a.P(parcel, 23);
            parcel.writeStringList(list);
            AbstractC0189a.Q(parcel, P7);
        }
        AbstractC0189a.M(parcel, 24, this.f14131K);
        AbstractC0189a.M(parcel, 25, this.f14132L);
        AbstractC0189a.M(parcel, 26, this.f14133M);
        AbstractC0189a.M(parcel, 27, this.f14134N);
        AbstractC0189a.R(parcel, 28, 4);
        parcel.writeInt(this.f14135O ? 1 : 0);
        AbstractC0189a.R(parcel, 29, 8);
        parcel.writeLong(this.f14136P);
        AbstractC0189a.R(parcel, 30, 4);
        parcel.writeInt(this.f14137Q);
        AbstractC0189a.M(parcel, 31, this.f14138R);
        AbstractC0189a.R(parcel, 32, 4);
        parcel.writeInt(this.f14139S);
        AbstractC0189a.R(parcel, 34, 8);
        parcel.writeLong(this.f14140T);
        AbstractC0189a.M(parcel, 35, this.f14141U);
        AbstractC0189a.M(parcel, 36, this.f14142V);
        AbstractC0189a.Q(parcel, P6);
    }

    public m1(String str, String str2, String str3, String str4, long j7, long j8, String str5, boolean z7, boolean z8, long j9, String str6, long j10, long j11, int i7, boolean z9, boolean z10, String str7, Boolean bool, long j12, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z11, long j13, int i8, String str12, int i9, long j14, String str13, String str14) {
        this.f14143q = str;
        this.f14144r = str2;
        this.f14145s = str3;
        this.f14152z = j9;
        this.f14146t = str4;
        this.f14147u = j7;
        this.f14148v = j8;
        this.f14149w = str5;
        this.f14150x = z7;
        this.f14151y = z8;
        this.f14122A = str6;
        this.f14123B = j10;
        this.f14124C = j11;
        this.f14125D = i7;
        this.f14126E = z9;
        this.F = z10;
        this.f14127G = str7;
        this.f14128H = bool;
        this.f14129I = j12;
        this.f14130J = arrayList;
        this.f14131K = str8;
        this.f14132L = str9;
        this.f14133M = str10;
        this.f14134N = str11;
        this.f14135O = z11;
        this.f14136P = j13;
        this.f14137Q = i8;
        this.f14138R = str12;
        this.f14139S = i9;
        this.f14140T = j14;
        this.f14141U = str13;
        this.f14142V = str14;
    }
}
