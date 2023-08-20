import subprocess

data = subprocess.check_output(
    ['netsh', 'wlan', 'show', 'profiles']).decode('utf-8').split('\n')
profiles = [i.split(":")[1][1:-1] for i in data if "All User Profile" in i]

for i in profiles:
    results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i,
                                       'key=clear']).decode('utf-8').split('\n')
    results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b]
    try:
        print("{:<30}| {:<}".format(i, results[0]))
    except IndexError:
        print("{:<30}| {:<}".format(i, ""))



# def cekHuruf(str):
#     hasil = 0;
#     for i in range(1,len(str)):
#         if str[i] == str[i-1]:
#             hasil += 1
#     return hasil

# def mira(stri):
#     if len(stri) < 50:
#         for i in (i, len(stri)):


# hurfRandom = "PCPCCPC"

# hasile =  cekHuruf(hurfRandom)

# print(hasile)