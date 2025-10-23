package v4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: v4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333k implements Closeable {

    /* renamed from: w  reason: collision with root package name */
    public static final Logger f15342w = Logger.getLogger(C1333k.class.getName());

    /* renamed from: q  reason: collision with root package name */
    public final RandomAccessFile f15343q;

    /* renamed from: r  reason: collision with root package name */
    public int f15344r;

    /* renamed from: s  reason: collision with root package name */
    public int f15345s;

    /* renamed from: t  reason: collision with root package name */
    public C1330h f15346t;

    /* renamed from: u  reason: collision with root package name */
    public C1330h f15347u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f15348v;

    public C1333k(File file) {
        byte[] bArr = new byte[16];
        this.f15348v = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i7 = 0;
                for (int i8 = 0; i8 < 4; i8++) {
                    Y(bArr2, i7, iArr[i8]);
                    i7 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f15343q = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int r3 = r(0, bArr);
        this.f15344r = r3;
        if (r3 <= randomAccessFile2.length()) {
            this.f15345s = r(4, bArr);
            int r5 = r(8, bArr);
            int r7 = r(12, bArr);
            this.f15346t = n(r5);
            this.f15347u = n(r7);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f15344r + ", Actual length: " + randomAccessFile2.length());
    }

    public static void Y(byte[] bArr, int i7, int i8) {
        bArr[i7] = (byte) (i8 >> 24);
        bArr[i7 + 1] = (byte) (i8 >> 16);
        bArr[i7 + 2] = (byte) (i8 >> 8);
        bArr[i7 + 3] = (byte) i8;
    }

    public static int r(int i7, byte[] bArr) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    public final void O(byte[] bArr, int i7, int i8) {
        int W = W(i7);
        int i9 = W + i8;
        int i10 = this.f15344r;
        RandomAccessFile randomAccessFile = this.f15343q;
        if (i9 <= i10) {
            randomAccessFile.seek(W);
            randomAccessFile.write(bArr, 0, i8);
            return;
        }
        int i11 = i10 - W;
        randomAccessFile.seek(W);
        randomAccessFile.write(bArr, 0, i11);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i11, i8 - i11);
    }

    public final int V() {
        if (this.f15345s == 0) {
            return 16;
        }
        C1330h c1330h = this.f15347u;
        int i7 = c1330h.f15337a;
        int i8 = this.f15346t.f15337a;
        if (i7 >= i8) {
            return (i7 - i8) + 4 + c1330h.f15338b + 16;
        }
        return (((i7 + 4) + c1330h.f15338b) + this.f15344r) - i8;
    }

    public final int W(int i7) {
        int i8 = this.f15344r;
        if (i7 >= i8) {
            return (i7 + 16) - i8;
        }
        return i7;
    }

    public final void X(int i7, int i8, int i9, int i10) {
        int[] iArr = {i7, i8, i9, i10};
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f15348v;
            if (i11 < 4) {
                Y(bArr, i12, iArr[i11]);
                i12 += 4;
                i11++;
            } else {
                RandomAccessFile randomAccessFile = this.f15343q;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    public final void a(byte[] bArr) {
        int W;
        int i7;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean j7 = j();
                    if (j7) {
                        W = 16;
                    } else {
                        C1330h c1330h = this.f15347u;
                        W = W(c1330h.f15337a + 4 + c1330h.f15338b);
                    }
                    C1330h c1330h2 = new C1330h(W, length);
                    Y(this.f15348v, 0, length);
                    O(this.f15348v, W, 4);
                    O(bArr, W + 4, length);
                    if (j7) {
                        i7 = W;
                    } else {
                        i7 = this.f15346t.f15337a;
                    }
                    X(this.f15344r, this.f15345s + 1, i7, W);
                    this.f15347u = c1330h2;
                    this.f15345s++;
                    if (j7) {
                        this.f15346t = c1330h2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void b() {
        X(4096, 0, 0, 0);
        this.f15345s = 0;
        C1330h c1330h = C1330h.f15336c;
        this.f15346t = c1330h;
        this.f15347u = c1330h;
        if (this.f15344r > 4096) {
            RandomAccessFile randomAccessFile = this.f15343q;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f15344r = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f15343q.close();
    }

    public final void f(int i7) {
        int i8 = i7 + 4;
        int V6 = this.f15344r - V();
        if (V6 >= i8) {
            return;
        }
        int i9 = this.f15344r;
        do {
            V6 += i9;
            i9 <<= 1;
        } while (V6 < i8);
        RandomAccessFile randomAccessFile = this.f15343q;
        randomAccessFile.setLength(i9);
        randomAccessFile.getChannel().force(true);
        C1330h c1330h = this.f15347u;
        int W = W(c1330h.f15337a + 4 + c1330h.f15338b);
        if (W < this.f15346t.f15337a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f15344r);
            long j7 = W - 4;
            if (channel.transferTo(16L, j7, channel) != j7) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i10 = this.f15347u.f15337a;
        int i11 = this.f15346t.f15337a;
        if (i10 < i11) {
            int i12 = (this.f15344r + i10) - 16;
            X(i9, this.f15345s, i11, i12);
            this.f15347u = new C1330h(i12, this.f15347u.f15338b);
        } else {
            X(i9, this.f15345s, i11, i10);
        }
        this.f15344r = i9;
    }

    public final synchronized void h(InterfaceC1332j interfaceC1332j) {
        int i7 = this.f15346t.f15337a;
        for (int i8 = 0; i8 < this.f15345s; i8++) {
            C1330h n = n(i7);
            interfaceC1332j.a(new C1331i(this, n), n.f15338b);
            i7 = W(n.f15337a + 4 + n.f15338b);
        }
    }

    public final synchronized boolean j() {
        boolean z7;
        if (this.f15345s == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        return z7;
    }

    public final C1330h n(int i7) {
        if (i7 == 0) {
            return C1330h.f15336c;
        }
        RandomAccessFile randomAccessFile = this.f15343q;
        randomAccessFile.seek(i7);
        return new C1330h(i7, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1333k.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f15344r);
        sb.append(", size=");
        sb.append(this.f15345s);
        sb.append(", first=");
        sb.append(this.f15346t);
        sb.append(", last=");
        sb.append(this.f15347u);
        sb.append(", element lengths=[");
        try {
            h(new I.h(sb));
        } catch (IOException e3) {
            f15342w.log(Level.WARNING, "read error", (Throwable) e3);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized void x() {
        try {
            if (!j()) {
                if (this.f15345s == 1) {
                    b();
                } else {
                    C1330h c1330h = this.f15346t;
                    int W = W(c1330h.f15337a + 4 + c1330h.f15338b);
                    y(W, 0, 4, this.f15348v);
                    int r3 = r(0, this.f15348v);
                    X(this.f15344r, this.f15345s - 1, W, this.f15347u.f15337a);
                    this.f15345s--;
                    this.f15346t = new C1330h(W, r3);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void y(int i7, int i8, int i9, byte[] bArr) {
        int W = W(i7);
        int i10 = W + i9;
        int i11 = this.f15344r;
        RandomAccessFile randomAccessFile = this.f15343q;
        if (i10 <= i11) {
            randomAccessFile.seek(W);
        } else {
            int i12 = i11 - W;
            randomAccessFile.seek(W);
            randomAccessFile.readFully(bArr, i8, i12);
            randomAccessFile.seek(16L);
            i8 += i12;
            i9 -= i12;
        }
        randomAccessFile.readFully(bArr, i8, i9);
    }
}
