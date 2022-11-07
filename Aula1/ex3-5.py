import os

PATH = "../folders"

def walk():
    for _, directories, files in os.walk(PATH):
        for directory in directories:
            print(directory)
        for file in files:
            print(file)

def scanDirPile(path):
    pile = os.scandir(path)

    for item in pile:
        if item.is_dir():
            print('<DIR> ' + item.name)
            scanDirPile(path + '/' + item.name)
        else:
            print(item.name)

def scanDirQueue(path):
    queue = [path]

    while len(queue) > 0:
        pathQ = queue.pop(0)
        for f in os.scandir(pathQ):
            if f.is_dir:
                print('<DIR> ' + f.name)
                queue.append(pathQ + '/' + f.name) 
            else:
                print(f.name)    

def main():
    scanDirQueue(PATH)


if __name__ == '__main__':
    main()
