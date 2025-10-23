package z4;

import B4.d;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import r0.AbstractC1111a;
import u4.C1285i;
import u4.C1287k;
import w4.B0;
import x4.C1466a;
/* renamed from: z4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517a {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f16454e = Charset.forName("UTF-8");
    public static final int f = 15;

    /* renamed from: g  reason: collision with root package name */
    public static final C1466a f16455g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final H.b f16456h = new H.b(18);

    /* renamed from: i  reason: collision with root package name */
    public static final C1285i f16457i = new C1285i(2);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f16458a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final C1518b f16459b;

    /* renamed from: c  reason: collision with root package name */
    public final d f16460c;
    public final C1287k d;

    public C1517a(C1518b c1518b, d dVar, C1287k c1287k) {
        this.f16459b = c1518b;
        this.f16460c = dVar;
        this.d = c1287k;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f16454e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f16454e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        C1518b c1518b = this.f16459b;
        arrayList.addAll(C1518b.u(((File) c1518b.f16464e).listFiles()));
        arrayList.addAll(C1518b.u(((File) c1518b.f).listFiles()));
        H.b bVar = f16456h;
        Collections.sort(arrayList, bVar);
        List u7 = C1518b.u(((File) c1518b.d).listFiles());
        Collections.sort(u7, bVar);
        arrayList.addAll(u7);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(C1518b.u(((File) this.f16459b.f16463c).list())).descendingSet();
    }

    public final void d(B0 b02, String str, boolean z7) {
        String str2;
        C1518b c1518b = this.f16459b;
        int i7 = this.f16460c.d().f260a.f259q;
        f16455g.getClass();
        String L6 = C1466a.f16220a.L(b02);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f16458a.getAndIncrement()));
        if (z7) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(c1518b.n(str, AbstractC1111a.r("event", format, str2)), L6);
        } catch (IOException e3) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e3);
        }
        C1285i c1285i = new C1285i(3);
        c1518b.getClass();
        File file = new File((File) c1518b.f16463c, str);
        file.mkdirs();
        List<File> u7 = C1518b.u(file.listFiles(c1285i));
        Collections.sort(u7, new H.b(19));
        int size = u7.size();
        for (File file2 : u7) {
            if (size > i7) {
                C1518b.t(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
