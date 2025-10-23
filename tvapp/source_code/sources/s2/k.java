package s2;

import O3.E;
import Z2.AbstractC0156a;
import Z2.y;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import i2.AbstractC0769a;
import java.nio.ByteBuffer;
import java.util.UUID;
import k2.InterfaceC0947l;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f13641a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f13642b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, byte[] bArr) {
        int i7;
        if (bArr != null) {
            i7 = bArr.length;
        } else {
            i7 = 0;
        }
        int i8 = i7 + 32;
        ByteBuffer allocate = ByteBuffer.allocate(i8);
        allocate.putInt(i8);
        allocate.putInt(1886614376);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static C2.e b(int i7, y yVar) {
        int g7 = yVar.g();
        if (yVar.g() == 1684108385) {
            yVar.G(8);
            String q5 = yVar.q(g7 - 16);
            return new C2.e("und", q5, q5);
        }
        AbstractC0156a.K("MetadataUtil", "Failed to parse comment attribute: " + AbstractC0769a.c(i7));
        return null;
    }

    public static C2.a c(y yVar) {
        String str;
        int g7 = yVar.g();
        if (yVar.g() == 1684108385) {
            int g8 = yVar.g() & 16777215;
            if (g8 == 13) {
                str = "image/jpeg";
            } else if (g8 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                AbstractC0515y1.q(g8, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            yVar.G(4);
            int i7 = g7 - 16;
            byte[] bArr = new byte[i7];
            yVar.e(bArr, 0, i7);
            return new C2.a(str, null, 3, bArr);
        }
        AbstractC0156a.K("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static C2.n d(int i7, String str, y yVar) {
        int g7 = yVar.g();
        if (yVar.g() == 1684108385 && g7 >= 22) {
            yVar.G(10);
            int z7 = yVar.z();
            if (z7 > 0) {
                String l7 = AbstractC0515y1.l("", z7);
                int z8 = yVar.z();
                if (z8 > 0) {
                    l7 = l7 + "/" + z8;
                }
                return new C2.n(str, null, E.x(l7));
            }
        }
        AbstractC0156a.K("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC0769a.c(i7));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static C.d e(byte[] bArr) {
        y yVar = new y(bArr);
        if (yVar.f4693c < 32) {
            return null;
        }
        yVar.F(0);
        if (yVar.g() != yVar.a() + 4 || yVar.g() != 1886614376) {
            return null;
        }
        int e3 = AbstractC0769a.e(yVar.g());
        if (e3 > 1) {
            AbstractC0515y1.q(e3, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(yVar.o(), yVar.o());
        if (e3 == 1) {
            yVar.G(yVar.x() * 16);
        }
        int x7 = yVar.x();
        if (x7 != yVar.a()) {
            return null;
        }
        ?? r22 = new byte[x7];
        yVar.e(r22, 0, x7);
        return new C.d(uuid, e3, r22, 10);
    }

    public static byte[] f(UUID uuid, byte[] bArr) {
        C.d e3 = e(bArr);
        if (e3 == null) {
            return null;
        }
        UUID uuid2 = (UUID) e3.f325s;
        if (!uuid.equals(uuid2)) {
            AbstractC0156a.K("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) e3.f326t;
    }

    public static C2.n g(int i7, String str, y yVar) {
        int g7 = yVar.g();
        if (yVar.g() == 1684108385) {
            yVar.G(8);
            return new C2.n(str, null, E.x(yVar.q(g7 - 16)));
        }
        AbstractC0156a.K("MetadataUtil", "Failed to parse text attribute: " + AbstractC0769a.c(i7));
        return null;
    }

    public static C2.j h(int i7, String str, y yVar, boolean z7, boolean z8) {
        int i8 = i(yVar);
        if (z8) {
            i8 = Math.min(1, i8);
        }
        if (i8 >= 0) {
            if (z7) {
                return new C2.n(str, null, E.x(Integer.toString(i8)));
            }
            return new C2.e("und", str, Integer.toString(i8));
        }
        AbstractC0156a.K("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC0769a.c(i7));
        return null;
    }

    public static int i(y yVar) {
        yVar.G(4);
        if (yVar.g() == 1684108385) {
            yVar.G(8);
            return yVar.u();
        }
        AbstractC0156a.K("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean j(InterfaceC0947l interfaceC0947l, boolean z7, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        long f = interfaceC0947l.f();
        long j7 = -1;
        int i8 = (f > (-1L) ? 1 : (f == (-1L) ? 0 : -1));
        long j8 = 4096;
        if (i8 != 0 && f <= 4096) {
            j8 = f;
        }
        int i9 = (int) j8;
        y yVar = new y(64);
        boolean z13 = false;
        int i10 = 0;
        boolean z14 = false;
        while (i10 < i9) {
            yVar.C(8);
            if (!interfaceC0947l.i(yVar.f4691a, z13 ? 1 : 0, 8, true)) {
                break;
            }
            long v5 = yVar.v();
            int g7 = yVar.g();
            if (v5 == 1) {
                interfaceC0947l.o(yVar.f4691a, 8, 8);
                yVar.E(16);
                i7 = 16;
                v5 = yVar.o();
            } else {
                if (v5 == 0) {
                    long f7 = interfaceC0947l.f();
                    if (f7 != j7) {
                        v5 = (f7 - interfaceC0947l.j()) + 8;
                    }
                }
                i7 = 8;
            }
            long j9 = i7;
            if (v5 < j9) {
                return z13;
            }
            i10 += i7;
            if (g7 == 1836019574) {
                i9 += (int) v5;
                if (i8 != 0 && i9 > f) {
                    i9 = (int) f;
                }
            } else if (g7 == 1836019558 || g7 == 1836475768) {
                z9 = z13 ? 1 : 0;
                z10 = true;
                z11 = true;
                break;
            } else {
                int i11 = i8;
                if ((i10 + v5) - j9 >= i9) {
                    z9 = false;
                    z10 = true;
                    break;
                }
                int i12 = (int) (v5 - j9);
                i10 += i12;
                if (g7 == 1718909296) {
                    if (i12 < 8) {
                        return false;
                    }
                    yVar.C(i12);
                    interfaceC0947l.o(yVar.f4691a, 0, i12);
                    int i13 = i12 / 4;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (i14 == 1) {
                            yVar.G(4);
                        } else {
                            int g8 = yVar.g();
                            if ((g8 >>> 8) != 3368816 && (g8 != 1751476579 || !z8)) {
                                int[] iArr = f13642b;
                                for (int i15 = 0; i15 < 29; i15++) {
                                    if (iArr[i15] != g8) {
                                    }
                                }
                                continue;
                            }
                            z14 = true;
                            break;
                        }
                    }
                    z12 = false;
                    z14 = z14;
                    if (!z14) {
                        return false;
                    }
                } else {
                    z12 = false;
                    z14 = z14;
                    if (i12 != 0) {
                        interfaceC0947l.p(i12);
                        z14 = z14;
                    }
                }
                z13 = z12;
                i8 = i11;
            }
            j7 = -1;
            z14 = z14;
        }
        z9 = z13 ? 1 : 0;
        z10 = true;
        z11 = z9;
        if (!z14 || z7 != z11) {
            return z9;
        }
        return z10;
    }
}
