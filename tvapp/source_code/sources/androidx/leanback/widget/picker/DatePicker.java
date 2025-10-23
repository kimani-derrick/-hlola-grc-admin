package androidx.leanback.widget.picker;

import X2.RunnableC0120b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.D;
import f0.AbstractC0659a;
import j0.AbstractC0781c;
import j0.C0782d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public class DatePicker extends AbstractC0781c {

    /* renamed from: S  reason: collision with root package name */
    public static final int[] f6625S = {5, 2, 1};
    public String F;

    /* renamed from: G  reason: collision with root package name */
    public C0782d f6626G;

    /* renamed from: H  reason: collision with root package name */
    public C0782d f6627H;

    /* renamed from: I  reason: collision with root package name */
    public C0782d f6628I;

    /* renamed from: J  reason: collision with root package name */
    public int f6629J;

    /* renamed from: K  reason: collision with root package name */
    public int f6630K;

    /* renamed from: L  reason: collision with root package name */
    public int f6631L;

    /* renamed from: M  reason: collision with root package name */
    public final SimpleDateFormat f6632M;

    /* renamed from: N  reason: collision with root package name */
    public final D f6633N;

    /* renamed from: O  reason: collision with root package name */
    public final Calendar f6634O;

    /* renamed from: P  reason: collision with root package name */
    public final Calendar f6635P;

    /* renamed from: Q  reason: collision with root package name */
    public final Calendar f6636Q;

    /* renamed from: R  reason: collision with root package name */
    public final Calendar f6637R;

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6632M = new SimpleDateFormat("MM/dd/yyyy");
        Locale locale = Locale.getDefault();
        getContext().getResources();
        this.f6633N = new D(locale);
        this.f6637R = AbstractC0958a.s(this.f6637R, locale);
        this.f6634O = AbstractC0958a.s(this.f6634O, (Locale) this.f6633N.f5883r);
        this.f6635P = AbstractC0958a.s(this.f6635P, (Locale) this.f6633N.f5883r);
        this.f6636Q = AbstractC0958a.s(this.f6636Q, (Locale) this.f6633N.f5883r);
        C0782d c0782d = this.f6626G;
        if (c0782d != null) {
            c0782d.d = (String[]) this.f6633N.f5884s;
            a(this.f6629J, c0782d);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f10200e);
        String string = obtainStyledAttributes.getString(0);
        String string2 = obtainStyledAttributes.getString(1);
        this.f6637R.clear();
        if (TextUtils.isEmpty(string) || !g(string, this.f6637R)) {
            this.f6637R.set(1900, 0, 1);
        }
        this.f6634O.setTimeInMillis(this.f6637R.getTimeInMillis());
        this.f6637R.clear();
        if (TextUtils.isEmpty(string2) || !g(string2, this.f6637R)) {
            this.f6637R.set(2100, 0, 1);
        }
        this.f6635P.setTimeInMillis(this.f6637R.getTimeInMillis());
        String string3 = obtainStyledAttributes.getString(2);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(DateFormat.getDateFormatOrder(context)) : string3);
    }

    public final boolean g(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f6632M.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    public long getDate() {
        return this.f6636Q.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.F;
    }

    public long getMaxDate() {
        return this.f6635P.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f6634O.getTimeInMillis();
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, j0.d] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, j0.d] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, j0.d] */
    public void setDatePickerFormat(String str) {
        String str2;
        int i7 = 6;
        D d = this.f6633N;
        if (TextUtils.isEmpty(str)) {
            str2 = new String(DateFormat.getDateFormatOrder(getContext()));
        } else {
            str2 = str;
        }
        if (TextUtils.equals(this.F, str2)) {
            return;
        }
        this.F = str2;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern((Locale) d.f5883r, str2);
        if (TextUtils.isEmpty(bestDateTimePattern)) {
            bestDateTimePattern = "MM/dd/yyyy";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        int i8 = 0;
        boolean z7 = false;
        char c5 = 0;
        while (i8 < bestDateTimePattern.length()) {
            char charAt = bestDateTimePattern.charAt(i8);
            if (charAt != ' ') {
                if (charAt == '\'') {
                    if (!z7) {
                        sb.setLength(0);
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    if (!z7) {
                        int i9 = 0;
                        while (i9 < i7) {
                            if (charAt == cArr[i9]) {
                                if (charAt != c5) {
                                    arrayList.add(sb.toString());
                                    sb.setLength(0);
                                }
                                c5 = charAt;
                            } else {
                                i9++;
                                i7 = 6;
                            }
                        }
                    }
                    sb.append(charAt);
                    c5 = charAt;
                }
            }
            i8++;
            i7 = 6;
        }
        arrayList.add(sb.toString());
        if (arrayList.size() == str2.length() + 1) {
            setSeparators(arrayList);
            this.f6627H = null;
            this.f6626G = null;
            this.f6628I = null;
            this.f6629J = -1;
            this.f6630K = -1;
            this.f6631L = -1;
            String upperCase = str2.toUpperCase();
            ArrayList arrayList2 = new ArrayList(3);
            for (int i10 = 0; i10 < upperCase.length(); i10++) {
                char charAt2 = upperCase.charAt(i10);
                if (charAt2 != 'D') {
                    if (charAt2 != 'M') {
                        if (charAt2 == 'Y') {
                            if (this.f6628I == null) {
                                ?? obj = new Object();
                                this.f6628I = obj;
                                arrayList2.add(obj);
                                this.f6631L = i10;
                                this.f6628I.f11535e = "%d";
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    } else if (this.f6626G == null) {
                        ?? obj2 = new Object();
                        this.f6626G = obj2;
                        arrayList2.add(obj2);
                        this.f6626G.d = (String[]) d.f5884s;
                        this.f6629J = i10;
                    } else {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                } else if (this.f6627H == null) {
                    ?? obj3 = new Object();
                    this.f6627H = obj3;
                    arrayList2.add(obj3);
                    this.f6627H.f11535e = "%02d";
                    this.f6630K = i10;
                } else {
                    throw new IllegalArgumentException("datePicker format error");
                }
            }
            setColumns(arrayList2);
            post(new RunnableC0120b(this));
            return;
        }
        throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + str2.length() + " + 1");
    }

    public void setMaxDate(long j7) {
        this.f6637R.setTimeInMillis(j7);
        if (this.f6637R.get(1) == this.f6635P.get(1) && this.f6637R.get(6) != this.f6635P.get(6)) {
            return;
        }
        this.f6635P.setTimeInMillis(j7);
        if (this.f6636Q.after(this.f6635P)) {
            this.f6636Q.setTimeInMillis(this.f6635P.getTimeInMillis());
        }
        post(new RunnableC0120b(this));
    }

    public void setMinDate(long j7) {
        this.f6637R.setTimeInMillis(j7);
        if (this.f6637R.get(1) == this.f6634O.get(1) && this.f6637R.get(6) != this.f6634O.get(6)) {
            return;
        }
        this.f6634O.setTimeInMillis(j7);
        if (this.f6636Q.before(this.f6634O)) {
            this.f6636Q.setTimeInMillis(this.f6634O.getTimeInMillis());
        }
        post(new RunnableC0120b(this));
    }
}
